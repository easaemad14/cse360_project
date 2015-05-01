/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenu>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QAction *actionQuit;
    QAction *actionAbout;
    QAction *actionPatient_Login;
    QAction *actionDoctor_Login;
    QAction *actionNew_User;
    QWidget *centralWidget;
    QLabel *label;
    QMenuBar *menuBar;
    QMenu *menuPatientPulse;
    QMenu *menuLogin;
    QMenu *menuHelp;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QStringLiteral("MainWindow"));
        MainWindow->resize(731, 446);
        MainWindow->setStyleSheet(QStringLiteral(""));
        actionQuit = new QAction(MainWindow);
        actionQuit->setObjectName(QStringLiteral("actionQuit"));
        actionAbout = new QAction(MainWindow);
        actionAbout->setObjectName(QStringLiteral("actionAbout"));
        actionPatient_Login = new QAction(MainWindow);
        actionPatient_Login->setObjectName(QStringLiteral("actionPatient_Login"));
        actionDoctor_Login = new QAction(MainWindow);
        actionDoctor_Login->setObjectName(QStringLiteral("actionDoctor_Login"));
        actionNew_User = new QAction(MainWindow);
        actionNew_User->setObjectName(QStringLiteral("actionNew_User"));
        centralWidget = new QWidget(MainWindow);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        label = new QLabel(centralWidget);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(20, 0, 721, 381));
        label->setStyleSheet(QStringLiteral("image: url(:/ekg_heart_rate_pulse-other.jpg);"));
        MainWindow->setCentralWidget(centralWidget);
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 731, 19));
        menuPatientPulse = new QMenu(menuBar);
        menuPatientPulse->setObjectName(QStringLiteral("menuPatientPulse"));
        menuLogin = new QMenu(menuPatientPulse);
        menuLogin->setObjectName(QStringLiteral("menuLogin"));
        menuHelp = new QMenu(menuBar);
        menuHelp->setObjectName(QStringLiteral("menuHelp"));
        MainWindow->setMenuBar(menuBar);
        mainToolBar = new QToolBar(MainWindow);
        mainToolBar->setObjectName(QStringLiteral("mainToolBar"));
        MainWindow->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        MainWindow->setStatusBar(statusBar);

        menuBar->addAction(menuPatientPulse->menuAction());
        menuBar->addAction(menuHelp->menuAction());
        menuPatientPulse->addAction(actionNew_User);
        menuPatientPulse->addAction(menuLogin->menuAction());
        menuPatientPulse->addSeparator();
        menuPatientPulse->addAction(actionQuit);
        menuLogin->addAction(actionPatient_Login);
        menuLogin->addAction(actionDoctor_Login);
        menuHelp->addAction(actionAbout);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "MainWindow", 0));
        actionQuit->setText(QApplication::translate("MainWindow", "Quit", 0));
        actionAbout->setText(QApplication::translate("MainWindow", "About", 0));
        actionPatient_Login->setText(QApplication::translate("MainWindow", "Patient Login", 0));
        actionDoctor_Login->setText(QApplication::translate("MainWindow", "Doctor Login", 0));
        actionNew_User->setText(QApplication::translate("MainWindow", "New User", 0));
        label->setText(QApplication::translate("MainWindow", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000;\">Welcome to Patient Pulse</span><span style=\" font-size:20pt; font-weight:600; color:#ff0000; vertical-align:super;\">TM</span></p><p align=\"center\"><span style=\" font-weight:600;\"><br/></span></p><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000;\"><br/></span></p><p align=\"center\"><span style=\" font-weight:600;\"><br/></span></p><p align=\"center\"><span style=\" font-weight:600;\"><br/></span></p><p align=\"center\"><span style=\" font-weight:600;\"><br/></span></p><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000; vertical-align:super;\">Please select the option that you would like to do from the</span></p><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000; vertical-align:super;\">menu and follow the instructions to complete the task. </span></p></body></html>", 0));
        menuPatientPulse->setTitle(QApplication::translate("MainWindow", "PatientPulse", 0));
        menuLogin->setTitle(QApplication::translate("MainWindow", "Login", 0));
        menuHelp->setTitle(QApplication::translate("MainWindow", "Help", 0));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
