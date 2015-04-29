#ifndef PATIENTOPTIONPAGE_H
#define PATIENTOPTIONPAGE_H

#include <QDialog>
#include "globals.h"
#include "mainwindow.h"

namespace Ui {
class PatientOptionPage;
}

class PatientOptionPage : public QDialog
{
    Q_OBJECT

public:
    explicit PatientOptionPage(QWidget *parent = 0);
    allOptions getOption();
    ~PatientOptionPage();

private slots:
    void on_newReportButton_clicked();
    void on_reportHistoryButton_clicked();
    void on_emergencyButton_clicked();
    void on_quitButton_clicked();

private:
    allOptions selOption;
    Ui::PatientOptionPage *ui;
};

#endif // PATIENTOPTIONPAGE_H
