/********************************************************************************
** Form generated from reading UI file 'patientoptionpage.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_PATIENTOPTIONPAGE_H
#define UI_PATIENTOPTIONPAGE_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_PatientOptionPage
{
public:
    QLabel *label;
    QPushButton *newReportButton;
    QPushButton *reportHistoryButton;
    QPushButton *emergencyButton;
    QPushButton *quitButton;

    void setupUi(QDialog *PatientOptionPage)
    {
        if (PatientOptionPage->objectName().isEmpty())
            PatientOptionPage->setObjectName(QStringLiteral("PatientOptionPage"));
        PatientOptionPage->resize(453, 428);
        label = new QLabel(PatientOptionPage);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(40, 10, 381, 61));
        newReportButton = new QPushButton(PatientOptionPage);
        newReportButton->setObjectName(QStringLiteral("newReportButton"));
        newReportButton->setGeometry(QRect(120, 100, 201, 61));
        QFont font;
        font.setPointSize(11);
        newReportButton->setFont(font);
        reportHistoryButton = new QPushButton(PatientOptionPage);
        reportHistoryButton->setObjectName(QStringLiteral("reportHistoryButton"));
        reportHistoryButton->setGeometry(QRect(120, 190, 201, 61));
        reportHistoryButton->setFont(font);
        emergencyButton = new QPushButton(PatientOptionPage);
        emergencyButton->setObjectName(QStringLiteral("emergencyButton"));
        emergencyButton->setGeometry(QRect(120, 280, 201, 61));
        emergencyButton->setFont(font);
        quitButton = new QPushButton(PatientOptionPage);
        quitButton->setObjectName(QStringLiteral("quitButton"));
        quitButton->setGeometry(QRect(120, 370, 101, 31));

        retranslateUi(PatientOptionPage);

        QMetaObject::connectSlotsByName(PatientOptionPage);
    } // setupUi

    void retranslateUi(QDialog *PatientOptionPage)
    {
        PatientOptionPage->setWindowTitle(QApplication::translate("PatientOptionPage", "Dialog", 0));
        label->setText(QApplication::translate("PatientOptionPage", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt; font-weight:600;\">Patient Option Page</span></p></body></html>", 0));
        newReportButton->setText(QApplication::translate("PatientOptionPage", "New PatientPulse Report", 0));
        reportHistoryButton->setText(QApplication::translate("PatientOptionPage", "Report History", 0));
        emergencyButton->setText(QApplication::translate("PatientOptionPage", "EMERGENCY!", 0));
        quitButton->setText(QApplication::translate("PatientOptionPage", "Quit", 0));
    } // retranslateUi

};

namespace Ui {
    class PatientOptionPage: public Ui_PatientOptionPage {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_PATIENTOPTIONPAGE_H
