#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

void MainWindow::createReport(){
    //Let's output the report page for the user to enter report
    Report reportPage;
    reportPage.setModal(true);
    reportPage.exec();

    if(reportPage.getReport()){ //Patient submitting report
        /* Let's now write the report to the disk */

        //First thing we need to do is check if directory exists
        QDir rDir; //Current Directory
        QString pathName = rDir.absolutePath();
        if(!rDir.exists(pathName + "/reports") ||
           !rDir.exists(pathName + "/reports/" + this->name)){
            //Create a directory and subdirectory
            rDir.mkpath(pathName + "/reports/" + this->name);
        }
        QDir cDir(pathName + "/reports/" + this->name); // Current directory
        cDir.setFilter(QDir::Files); //We will need this for file list

        //Now we need to check figure out a good name for report
        QStringList fList = cDir.entryList(); //List of all files
        this->numReports = fList.size(); //Let's make sure this is set
        QString rNum; rNum.setNum(this->numReports + 1);
        QString fileName = pathName + "/reports/" + this->name + "/" +
                            this->name + "_" + rNum + ".txt";

        /***********************************************************************
         * We have everything we need to create a new file, so let's get down to
         * business!
         *
         * The first thing I am going to do (and this line is very ugly) is
         * create a file rFile. Now the path to this file is set on the right-
         * hand side of the expression, and that is the ugly part. We have the
         * pathName, which represents the current directory that we are
         * operating in, and we created a reports and a directory for the
         * current logged in patient, so we will call the report the patient's
         * name, followed by an underscore and the number casted to a QString.
         *
         * Maybe now you can appreciate my brilliance! Muahahaha
         **********************************************************************/
        QFile rFile(fileName);

        //Let's make sure we can write text to the file
        if(!rFile.open(QFile::WriteOnly | QFile::Text)){ //Also truncates!
            //Error opening the file!
            return;
        }
        else{
            //If we get here, then we have successfully opened the file
            QTextStream out(&rFile);
            QString sUrg, sPain, sDrows, sNaus, sAnx, sDepres;

            //Get the values and store them into a string
            sUrg.setNum(reportPage.getUrg());  //This is something that we will not want to write for patient to see!
            sPain.setNum(reportPage.getPain());
            sDrows.setNum(reportPage.getDrows());
            sNaus.setNum(reportPage.getNaus());
            sAnx.setNum(reportPage.getAnx());
            sDepres.setNum(reportPage.getDepres());

            //Now that we have all of this information, we can write
            out <<  sUrg << "\n"; //We don't want the patient to know this
            out << "Pain:\t" << sPain << "\n";
            out << "Drowsiness:\t" << sDrows << "\n";
            out << "Nausea:\t" << sNaus << "\n";
            out << "Anxiety:\t" << sAnx << "\n";
            out << "Depression:\t" << sDepres << "\n";
            out << "\n";
            out << "Comment:\t" << reportPage.getCom() << "\n";
            out << "\n";
            out << "Doctor Message: " << reportPage.getDocCom() << "\n";

            //Flush and close our file now that we are done
            rFile.flush();
            rFile.close();

            //File has been written, let's inform the user of success
            Submission success;
            success.setModal(true);
            success.exec();
        }
    }
}

void MainWindow::history(){
    /***************************************************************************
     * This function will create a new history window that displays reports in
     * the form of a tabbed widget.
     *
     * If the directory doesn't exist, or there are no reports in the directory,
     * then we don't display anything. Otherwise, we create a tab for each
     * report to display.
     *
     * Once the user is done checking the reports, the window closes and the
     * session ends.
     **************************************************************************/
    QDir rDir("./reports/" + this->name); //Current Directory
    rDir.setFilter(QDir::Files);
    QStringList fList = rDir.entryList();
    this->numReports = fList.size();

    //A little bit of logic
    if(!rDir.exists() || this->numReports == 0){
        NoHistory errBox;
        errBox.setModal(true);
        errBox.exec();
    }
    else{
        //We need to create a new History and set the attributes
        History pHistory;
        pHistory.setModal(true);

        //We need to display the files on the tabs and write the data to text
        int i=1; //This keeps track of the report list for us

        //psuedo-recursive if tree. The problem is the method call :/
        if(this->numReports - i >= 0){
            QFile pFile(rDir.absolutePath() + "/" + fList.at(this->numReports - i));
            if(pFile.open(QFile::ReadOnly | QFile::Text)){
                QTextStream pStream(&pFile);
                pHistory.setTab1Text(pStream.readAll()); //Small Files!
                i++;
                pFile.close(); //Don't forget to close!
            }
        }
        if(this->numReports - i >= 0){
            QFile pFile(rDir.absolutePath() + "/" + fList.at(this->numReports - i));
            if(pFile.open(QFile::ReadOnly | QFile::Text)){
                QTextStream pStream(&pFile);
                pHistory.setTab2Text(pStream.readAll());
                i++;
                pFile.close();
            }
        }
        if(this->numReports - i >= 0){
            QFile pFile(rDir.absolutePath() + "/" + fList.at(this->numReports - i));
            if(pFile.open(QFile::ReadOnly | QFile::Text)){
                QTextStream pStream(&pFile);
                pHistory.setTab3Text(pStream.readAll());
                i++;
                pFile.close();
            }
        }
        if(this->numReports - i >= 0){
            QFile pFile(rDir.absolutePath() + "/" + fList.at(this->numReports - i));
            if(pFile.open(QFile::ReadOnly | QFile::Text)){
                QTextStream pStream(&pFile);
                pHistory.setTab4Text(pStream.readAll());
                i++;
                pFile.close();
            }
        }
        if(this->numReports - i >= 0){
            QFile pFile(rDir.absolutePath() + "/" + fList.at(this->numReports - i));
            if(pFile.open(QFile::ReadOnly | QFile::Text)){
                QTextStream pStream(&pFile);
                pHistory.setTab5Text(pStream.readAll());
                i++; //Don't really need, but we consistant
                pFile.close();
            }
        }
        pHistory.exec();
    }
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_actionQuit_triggered()
{
    this->isLogged = false;
    QApplication::quit();
}

void MainWindow::on_actionAbout_triggered()
{
    this->imageBox = new about(this);
    imageBox->show();
}

void MainWindow::on_actionPatient_Login_triggered()
{
    //Now we run the login page to get the input from the user
    LoginPage login;
    login.setModal(true); //Only this window can be modified when open
    login.setLogType("Patient");
    login.exec();

    //Set the session variables for specific patient
    this->name = login.getLogName();
    this->validLogin = login.getValid(); //Checks Validity
    this->isLogged = login.getValid(); //Maintains state

    //User stays here until they quit
    while(this->isLogged){
        //Now check if user successfully loggin in; if so, go to option page
        if(this->validLogin){ //User can quit before being logged in
            PatientOptionPage optionPage;
            optionPage.setModal(true);
            optionPage.exec();

            //This will tell us what action to take in our if-else
            this->optionNum = optionPage.getOption();

            if(this->optionNum == createNewReport){
                //This is a long procedure, so a new function was created
                this->createReport();
            }
            else if(this->optionNum == getHistory){
                this->history();
            }
            else if(this->optionNum == emergency){
                EmergencyDialog eMessage;
                eMessage.setModal(true);
                eMessage.exec();
            }
            else{
                this->isLogged = false;
            }
        }
    }
}

void MainWindow::on_actionDoctor_Login_triggered()
{
    //Now we run the login page to get the input from the user
    LoginPage login;
    login.setModal(true); //Only this window can be modified when open
    login.setLogType("Doctor");
    login.exec();

    //Set the session variables for specific patient
    this->name = login.getLogName();
    this->validLogin = login.getValid();
    this->isLogged = login.getValid();

    //Doctor stays here while in app
    while(this->isLogged){
        //Now check if user successfully loggin in; if so, go to option page
        if(this->validLogin){ //User can quit before being logged in
            QDir cDir("./reports"); //Current Directory
            cDir.setFilter(QDir::Dirs | QDir::NoDotAndDotDot);
            QStringList pList = cDir.entryList(); //List of all patient dirs

            PatientRoster roster;
            roster.setModal(true);

            /*******************************************************************
             * Okay, things are about to get silly!
             *
             * First thing we have to do is read each patient's most recent
             * report (if one exists), and based off of the urgency stored in
             * the corresponding report, we have to set the patient's name and
             * urgency in decreasing order from 1 to 5.
             *
             * A much more complete version would check to see if the doctor
             * already messaged the patient, so that any patient that has
             * already received attention would not come before a patient that
             * hasn't, but this is the beta version :)
             ******************************************************************/
            //Something's not right here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            QStringList pUrgList;
            foreach (QString patient, pList){
                QDir pDir("./reports/" + patient);
                pDir.setFilter(QDir::Files);
                QStringList reps = pDir.entryList(); //List of all reports
                QString lastRep;
                lastRep.setNum(reps.length());

                QFile lastFile(pDir.absolutePath() + "/" + patient + "_" + lastRep + ".txt");
                if(lastFile.open(QFile::ReadOnly | QFile::Text)){
                    QTextStream urgNum(&lastFile);
                    QString urgLine = urgNum.readLine(); //Urgency on first line
                    pUrgList << urgLine;

                    //Don't forget to flush and close!
                    lastFile.close();
                    urgNum.flush();
                }
                else pUrgList << "0"; //We need to maintain size
            }

            /*
            //I am having trouble getting this to work!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //Now you should have a complete list of urgencies
            if(pList.length() > 1){ //We have two patients
                if(pUrgList.at(0).isEmpty()){
                    roster.setP2Name(pList.at(0));
                    roster.setP2Urg(pUrgList.at(0));
                }
                if(pUrgList.at(1).isEmpty()){
                    if(roster.getP2Name() == pList.at(0)){
                        roster.setP1Name(pList.at(1));
                        roster.setP1Urg(pUrgList.at(1));
                    }
                    else{
                        roster.setP2Name(pList.at(1));
                        roster.setP2Urg(pUrgList.at(1));
                        roster.setP1Name(pList.at(0));
                        roster.setP1Urg(pUrgList.at(0));
                    }
                }
                if(!pUrgList.at(0).isEmpty() && !pUrgList.at(1).isEmpty()){
                    //We need to compare the values somehow
                }
            }
            else{ //We only have one patient to show
                if(pUrgList.at(0).isEmpty()){
                    roster.setP2Name(pList.at(0));
                    roster.setP2Urg(pUrgList.at(0));
                }
            }
            */

            roster.setP1Name(pList.at(0));
            roster.setP1Urg(pUrgList.at(0));
            roster.setP2Name(pList.at(1));
            roster.setP2Urg(pUrgList.at(1));

            roster.exec();

            this->numPatient = roster.getPatient();

            if(this->numPatient > 0){
                cDir = "./reports/" + pList.at(this->numPatient - 1);
                cDir.setFilter(QDir::Files);
                QStringList reps = cDir.entryList(); //List of all reports
                QString lastRep;
                lastRep.setNum(reps.length());

                QFile lFile(cDir.absolutePath() + "/" + pList.at(this->numPatient-1) + "_" + lastRep + ".txt");
                if(lFile.open(QFile::ReadWrite | QFile::Text)){
                    PatientSummary pSum;
                    pSum.setModal(true);

                    QTextStream rMessage(&lFile);
                    pSum.setMessage(rMessage.readAll());
                    pSum.exec();

                    rMessage << pSum.getMessage();

                    rMessage.flush();
                    lFile.close();
                }
            }
            else{
                this->isLogged = false;
            }
        }
    }
}
