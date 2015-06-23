#include "emergencydialog.h"
#include "ui_emergencydialog.h"

EmergencyDialog::EmergencyDialog(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::EmergencyDialog)
{
    ui->setupUi(this);
}

EmergencyDialog::~EmergencyDialog()
{
    delete ui;
}

void EmergencyDialog::on_dieButton_clicked()
{
    ui->errLabel->setText("Sorry, that's not an option with this version!");
}

void EmergencyDialog::on_okayButton_clicked()
{
    this->close();
}
