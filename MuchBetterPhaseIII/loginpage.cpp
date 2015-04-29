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
    //Finish this
    this->isValid = false;
    this->logName = ui->nameLine->text();
    this->logPass = ui->passLine->text();

    if((this->logName == this->logType) && (this->logPass == this->logType)){
        this->isValid = true;
        this->close();
    }
    else{
        ui->errLabel->setText("Invalid Login! Please try again!");
    }

    //Can't get the program to read from file. Also tried putting in home
    /*
    QString typeLine = "--" + this->logType;
    QFile passFile("./passwds.txt");

    if(!passFile.open(QFile::ReadOnly | QFile::Text)){
        //Error opening the file!
        ui->errLabel->setText("Error Reading password file!");
    }
    else{
        QTextStream passStream(&passFile);

        //First thing that we have to do is find the correct logType
        while(passStream.readLine() != "--" + this->logType){}

        //Now check all log types
        while(!passStream.atEnd()){
            if(passStream.readLine() == this->logName + " " + this->logPass){
                this->isValid = true;
                passFile.close();
                this->close();
            }
            else{
                ui->errLabel->setText("Invalid Login! Please try again!");
            }
        }
    } */
}

void LoginPage::on_quitButton_clicked()
{
    this->isValid = false;
    this->close();
}
