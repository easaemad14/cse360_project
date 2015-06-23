#include "patientsummary.h"
#include "ui_patientsummary.h"

PatientSummary::PatientSummary(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::PatientSummary)
{
    ui->setupUi(this);
}

void PatientSummary::setMessage(QString message){
    ui->textEdit->setText(message);
}

QString PatientSummary::getMessage(){
    return this->message;
}

PatientSummary::~PatientSummary()
{
    delete ui;
}

void PatientSummary::on_messButton_clicked()
{
    MessageBox box;
    box.setModal(true);
    box.exec();

    this->message = box.getMessage();
    this->close();
}

void PatientSummary::on_quitButton_clicked()
{
    this->close();
}
