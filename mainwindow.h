#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QString>
#include <QDir>
#include <QFile>
#include <QTextStream>
#include "globals.h"
#include "about.h"
#include "loginpage.h"
#include "patientoptionpage.h"
#include "emergencydialog.h"
#include "report.h"
#include "submission.h"
#include "history.h"
#include "nohistory.h"
#include "patientroster.h"
#include "patientsummary.h"

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

private slots:
    void on_actionQuit_triggered();
    void on_actionAbout_triggered();
    void on_actionPatient_Login_triggered();
    void on_actionDoctor_Login_triggered();

private:
    //Variables that each session requires
    bool validLogin, isLogged;
    QString name;
    allOptions optionNum;
    int numReports, numPatient;

    //Windows
    Ui::MainWindow *ui;
    about *imageBox;

    //Private functions (or methods, if you will)
    void createReport();
    void history();
};

#endif // MAINWINDOW_H
