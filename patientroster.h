#ifndef PATIENTROSTER_H
#define PATIENTROSTER_H

#include <QDialog>
#include <QStringList>
#include "globals.h"

namespace Ui {
class PatientRoster;
}

class PatientRoster : public QDialog
{
    Q_OBJECT

public:
    explicit PatientRoster(QWidget *parent = 0);
    allOptions getOption();
    int getPatient();
    QString getP1Name();
    QString getP2Name();
    QString getP3Name();
    QString getP4Name();
    QString getP5Name();
    void setP1Name(QString name);
    void setP2Name(QString name);
    void setP3Name(QString name);
    void setP4Name(QString name);
    void setP5Name(QString name);
    void setP1Urg(QString urgency);
    void setP2Urg(QString urgency);
    void setP3Urg(QString urgency);
    void setP4Urg(QString urgency);
    void setP5Urg(QString urgency);
    ~PatientRoster();

private slots:
    void on_quitButton_clicked();
    void on_p3Name_clicked();
    void on_p1Name_clicked();
    void on_p2Name_clicked();
    void on_p4Name_clicked();
    void on_p5Name_clicked();

private:
    allOptions docOption;
    int pNum;
    Ui::PatientRoster *ui;
};

#endif // PATIENTROSTER_H
