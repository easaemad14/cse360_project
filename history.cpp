#include "history.h"
#include "ui_history.h"

History::History(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::History)
{
    ui->setupUi(this);
}

void History::setTab1Text(QString text){
    ui->tab1Text->setText(text);
}

void History::setTab2Text(QString text){
    ui->tab2Text->setText(text);
}

void History::setTab3Text(QString text){
    ui->tab3Text->setText(text);
}

void History::setTab4Text(QString text){
    ui->tab4Text->setText(text);
}

void History::setTab5Text(QString text){
    ui->tab5Text->setText(text);
}

History::~History()
{
    delete ui;
}

void History::on_pushButton_clicked()
{
    this->close();
}
