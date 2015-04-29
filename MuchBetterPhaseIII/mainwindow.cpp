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
                            this->name + "_" + rNum;

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
        if(!rFile.open(QFile::WriteOnly | QFile::Text)){
            //Error opening the file!
            return;
        }
        else{
            //If we get here, then we have successfully opened the file
            QTextStream out(&rFile);
            QString sPain, sDrows, sNaus, sAnx, sDepres;

            //Get the values and store them into a string
            sPain.setNum(reportPage.getPain());
            sDrows.setNum(reportPage.getDrows());
            sNaus.setNum(reportPage.getNaus());
            sAnx.setNum(reportPage.getAnx());
            sDepres.setNum(reportPage.getDepres());

            //Now that we have all of this information, we can write
            out << "Pain:\t\t" << sPain << "\n";
            out << "Drowsiness:\t" << sDrows << "\n";
            out << "Nausea:\t\t" << sNaus << "\n";
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
        History pHistory;
        pHistory.setModal(true);
        //Display each report in the tabbed section!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        pHistory.exec();
    }
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_actionQuit_triggered()
{
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
    this->validLogin = login.getValid();

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

    //Now check if user successfully loggin in; if so, go to option page
    if(this->validLogin){ //User can quit before being logged in

    }
}
