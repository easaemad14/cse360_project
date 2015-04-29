#include "nohistory.h"
#include "ui_nohistory.h"

NoHistory::NoHistory(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::NoHistory)
{
    ui->setupUi(this);
}

NoHistory::~NoHistory()
{
    delete ui;
}

void NoHistory::on_pushButton_clicked()
{
    this->close();
}
