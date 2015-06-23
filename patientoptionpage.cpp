#include "patientoptionpage.h"
#include "ui_patientoptionpage.h"

PatientOptionPage::PatientOptionPage(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::PatientOptionPage)
{
    ui->setupUi(this);
}

allOptions PatientOptionPage::getOption(){
    return this->selOption;
}

PatientOptionPage::~PatientOptionPage()
{
    delete ui;
}

void PatientOptionPage::on_newReportButton_clicked()
{
    this->selOption = createNewReport;
    this->close();
}

void PatientOptionPage::on_reportHistoryButton_clicked()
{
    this->selOption = getHistory;
    this->close();
}

void PatientOptionPage::on_emergencyButton_clicked()
{
    this->selOption = emergency;
    this->close();
}

void PatientOptionPage::on_quitButton_clicked()
{
    this->selOption = optionQuit;
    this->close();
}
