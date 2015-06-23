#include "loginpage.h"
#include "ui_loginpage.h"
#include "mainwindow.h"

LoginPage::LoginPage(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::LoginPage)
{
    this->isValid = false; //SECURITY!
    ui->setupUi(this);
}

bool LoginPage::getValid(){
    return this->isValid;
}

LoginPage::~LoginPage()
{
    delete ui;
}

QString LoginPage::getLogName(){
    return this->logName;
}

QString LoginPage::getLogPass(){
    return this->logPass;
}

void LoginPage::setLogType(QString type){
    this->logType = type;
}

void LoginPage::on_confirmButton_clicked()
{
    /***************************************************************************
     * As you may be able to tell, reading from my included resource password
     * file is giving us an error, so we are hardcoding the patients and the
     * one doctor.
     **************************************************************************/
    this->isValid = false;
    this->logName = ui->nameLine->text();
    this->logPass = ui->passLine->text();

    //Read the stored usernames and passwords from the stored text file
    //This is the most secure way to do it :)
    QFile passFile(":/passwds.txt");

    if(!passFile.open(QFile::ReadOnly | QFile::Text)){
        //Error opening the file!
        ui->errLabel->setText("Error Reading Login! Please Contact Admin!");
    }
    else{
        QTextStream passStream(&passFile);

        //Read the file until either the username and password are found or end
        while(!this->isValid && !passStream.atEnd()){
            if(passStream.readLine() == this->logName + " " + this->logPass){
                this->isValid = true;
            }
        }
        //May we will want to make sure that the correct log type!!!!!!!!!!!!!!!!!!!!!!!!!!
        if(this->isValid){ //We broke because we found the correct credentials
            passStream.flush();
            passFile.close();
            this->close();
        }
        else{
            ui->errLabel->setText("Invalid Login! Please try again!");
            passStream.flush();
            passFile.close();
        }
    }
}

void LoginPage::on_quitButton_clicked()
{
    this->isValid = false;
    this->close();
}
