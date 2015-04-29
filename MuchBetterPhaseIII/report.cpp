#include "report.h"
#include "ui_report.h"

Report::Report(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::Report)
{
    ui->setupUi(this);
}

bool Report::getReport(){
    return this->isReport;
}

int Report::getPain(){
    return this->nReport.pain;
}

int Report::getDrows(){
    return this->nReport.drowsiness;
}

int Report::getNaus(){
    return this->nReport.nausea;
}

int Report::getAnx(){
    return this->nReport.anxiety;
}

int Report::getDepres(){
    return this->nReport.depression;
}

int Report::getUrg(){
    return this->nReport.urgency;
}

QString Report::getCom(){
    return this->nReport.comment;
}

QString Report::getDocCom(){
    return this->nReport.docMessage;
}

Report::~Report()
{
    delete ui;
}

void Report::on_pushButton_2_clicked()
{
    this->isReport = false;
    this->close();
}

void Report::on_pushButton_clicked()
{
    //Store data into report
    this->nReport.pain = ui->painBox->value();
    this->nReport.drowsiness = ui->drowsBox->value();
    this->nReport.nausea = ui->nauseaBox->value();
    this->nReport.anxiety = ui->anxBox->value();
    this->nReport.depression = ui->depressBox->value();
    this->nReport.urgency = (this->nReport.pain + this->nReport.drowsiness
                             + this->nReport.nausea + this->nReport.anxiety
                             + this->nReport.depression) / 5; //Average

    this->nReport.comment = ui->commentField->toPlainText();
    this->nReport.comment.truncate(255); //We will store a max of 255 chars

    //Now we need to know if a report was actually set to write
    this->isReport = true;

    //After you are done writing the report, close and return to Main Page
    this->close();
}
