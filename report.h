#ifndef REPORT_H
#define REPORT_H

#include <QDialog>
#include <QString>
#include "globals.h"

namespace Ui {
class Report;
}

class Report : public QDialog
{
    Q_OBJECT

public:
    explicit Report(QWidget *parent = 0);
    bool getReport();
    int getPain();
    int getDrows();
    int getNaus();
    int getAnx();
    int getDepres();
    int getUrg();
    QString getCom();
    QString getDocCom();
    ~Report();

private slots:
    void on_pushButton_2_clicked();
    void on_pushButton_clicked();

private:
    report_t nReport;
    bool isReport;
    Ui::Report *ui;
};

#endif // REPORT_H
