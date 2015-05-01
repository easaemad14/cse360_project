/********************************************************************************
** Form generated from reading UI file 'submission.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_SUBMISSION_H
#define UI_SUBMISSION_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_Submission
{
public:
    QLabel *label;
    QPushButton *pushButton;

    void setupUi(QDialog *Submission)
    {
        if (Submission->objectName().isEmpty())
            Submission->setObjectName(QStringLiteral("Submission"));
        Submission->resize(407, 152);
        label = new QLabel(Submission);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(10, 10, 381, 41));
        pushButton = new QPushButton(Submission);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(120, 80, 131, 51));

        retranslateUi(Submission);

        QMetaObject::connectSlotsByName(Submission);
    } // setupUi

    void retranslateUi(QDialog *Submission)
    {
        Submission->setWindowTitle(QApplication::translate("Submission", "Dialog", 0));
        label->setText(QApplication::translate("Submission", "<html><head/><body><p align=\"center\"><span style=\" font-size:18pt;\">Report Successfully Submitted!</span></p></body></html>", 0));
        pushButton->setText(QApplication::translate("Submission", "Quit", 0));
    } // retranslateUi

};

namespace Ui {
    class Submission: public Ui_Submission {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_SUBMISSION_H
