/********************************************************************************
** Form generated from reading UI file 'loginpage.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_LOGINPAGE_H
#define UI_LOGINPAGE_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_LoginPage
{
public:
    QLabel *label;
    QLabel *label_2;
    QLabel *label_3;
    QLineEdit *nameLine;
    QLineEdit *passLine;
    QPushButton *confirmButton;
    QPushButton *quitButton;
    QLabel *errLabel;

    void setupUi(QDialog *LoginPage)
    {
        if (LoginPage->objectName().isEmpty())
            LoginPage->setObjectName(QStringLiteral("LoginPage"));
        LoginPage->resize(434, 398);
        label = new QLabel(LoginPage);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(120, 0, 181, 91));
        label_2 = new QLabel(LoginPage);
        label_2->setObjectName(QStringLiteral("label_2"));
        label_2->setGeometry(QRect(90, 110, 101, 16));
        label_3 = new QLabel(LoginPage);
        label_3->setObjectName(QStringLiteral("label_3"));
        label_3->setGeometry(QRect(90, 180, 111, 16));
        nameLine = new QLineEdit(LoginPage);
        nameLine->setObjectName(QStringLiteral("nameLine"));
        nameLine->setGeometry(QRect(90, 130, 241, 22));
        passLine = new QLineEdit(LoginPage);
        passLine->setObjectName(QStringLiteral("passLine"));
        passLine->setGeometry(QRect(90, 200, 241, 22));
        confirmButton = new QPushButton(LoginPage);
        confirmButton->setObjectName(QStringLiteral("confirmButton"));
        confirmButton->setGeometry(QRect(90, 280, 111, 61));
        quitButton = new QPushButton(LoginPage);
        quitButton->setObjectName(QStringLiteral("quitButton"));
        quitButton->setGeometry(QRect(220, 280, 111, 61));
        errLabel = new QLabel(LoginPage);
        errLabel->setObjectName(QStringLiteral("errLabel"));
        errLabel->setGeometry(QRect(100, 240, 221, 20));

        retranslateUi(LoginPage);

        QMetaObject::connectSlotsByName(LoginPage);
    } // setupUi

    void retranslateUi(QDialog *LoginPage)
    {
        LoginPage->setWindowTitle(QApplication::translate("LoginPage", "Dialog", 0));
        label->setText(QApplication::translate("LoginPage", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt; font-weight:600;\">Login Page</span></p></body></html>", 0));
        label_2->setText(QApplication::translate("LoginPage", "User Name:", 0));
        label_3->setText(QApplication::translate("LoginPage", "Password:", 0));
        confirmButton->setText(QApplication::translate("LoginPage", "Confirm", 0));
        quitButton->setText(QApplication::translate("LoginPage", "Quit", 0));
        errLabel->setText(QApplication::translate("LoginPage", "<html><head/><body><p align=\"center\"><br/></p></body></html>", 0));
    } // retranslateUi

};

namespace Ui {
    class LoginPage: public Ui_LoginPage {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_LOGINPAGE_H
