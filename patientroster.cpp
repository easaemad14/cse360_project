#include "patientroster.h"
#include "ui_patientroster.h"

PatientRoster::PatientRoster(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::PatientRoster)
{
    ui->setupUi(this);

    ui->p1Urg->setText("");
    ui->p2Urg->setText("");
    ui->p3Urg->setText("");
    ui->p4Urg->setText("");
    ui->p5Urg->setText("");

    ui->p1Name->setText("");
    ui->p2Name->setText("");
    ui->p3Name->setText("");
    ui->p4Name->setText("");
    ui->p5Name->setText("");
}

int PatientRoster::getPatient(){ //Only one patient per roster (updates)
    return this->pNum;
}

QString PatientRoster::getP1Name(){
    return ui->p1Name->text();
}

QString PatientRoster::getP2Name(){
    return ui->p2Name->text();
}

QString PatientRoster::getP3Name(){
    return ui->p3Name->text();
}

QString PatientRoster::getP4Name(){
    return ui->p4Name->text();
}

QString PatientRoster::getP5Name(){
    return ui->p5Name->text();
}

void PatientRoster::setP1Name(QString name){
    ui->p1Name->setText(name);
}

void PatientRoster::setP2Name(QString name){
    ui->p2Name->setText(name);
}

void PatientRoster::setP3Name(QString name){
    ui->p3Name->setText(name);
}

void PatientRoster::setP4Name(QString name){
    ui->p4Name->setText(name);
}

void PatientRoster::setP5Name(QString name){
    ui->p5Name->setText(name);
}

void PatientRoster::setP1Urg(QString urgency){
    ui->p1Urg->setText(urgency);
}

void PatientRoster::setP2Urg(QString urgency){
    ui->p2Urg->setText(urgency);
}

void PatientRoster::setP3Urg(QString urgency){
    ui->p3Urg->setText(urgency);
}

void PatientRoster::setP4Urg(QString urgency){
    ui->p4Urg->setText(urgency);
}

void PatientRoster::setP5Urg(QString urgency){
    ui->p5Urg->setText(urgency);
}

PatientRoster::~PatientRoster()
{
    delete ui;
}

void PatientRoster::on_quitButton_clicked()
{
    this->pNum = -1;
    this->close();
}

void PatientRoster::on_p3Name_clicked()
{
    this->pNum = 3;
    this->close();
}

void PatientRoster::on_p1Name_clicked()
{
    this->pNum = 1;
    this->close();
}

void PatientRoster::on_p2Name_clicked()
{
    this->pNum = 2;
    this->close();
}

void PatientRoster::on_p4Name_clicked()
{
    this->pNum = 4;
    this->close();
}

void PatientRoster::on_p5Name_clicked()
{
    this->pNum = 5;
    this->close();
}
