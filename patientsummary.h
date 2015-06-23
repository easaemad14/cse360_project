#ifndef PATIENTSUMMARY_H
#define PATIENTSUMMARY_H

#include <QDialog>
#include "messagebox.h"

namespace Ui {
class PatientSummary;
}

class PatientSummary : public QDialog
{
    Q_OBJECT

public:
    explicit PatientSummary(QWidget *parent = 0);
    void setMessage(QString message);
    QString getMessage();
    ~PatientSummary();

private slots:
    void on_messButton_clicked();
    void on_quitButton_clicked();

private:
    QString message;
    Ui::PatientSummary *ui;
};

#endif // PATIENTSUMMARY_H
