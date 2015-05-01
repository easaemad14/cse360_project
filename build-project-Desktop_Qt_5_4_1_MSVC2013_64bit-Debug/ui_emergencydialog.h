/********************************************************************************
** Form generated from reading UI file 'emergencydialog.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_EMERGENCYDIALOG_H
#define UI_EMERGENCYDIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_EmergencyDialog
{
public:
    QLabel *label;
    QLabel *errLabel;
    QPushButton *okayButton;
    QPushButton *dieButton;

    void setupUi(QDialog *EmergencyDialog)
    {
        if (EmergencyDialog->objectName().isEmpty())
            EmergencyDialog->setObjectName(QStringLiteral("EmergencyDialog"));
        EmergencyDialog->resize(561, 407);
        label = new QLabel(EmergencyDialog);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(90, 0, 351, 201));
        errLabel = new QLabel(EmergencyDialog);
        errLabel->setObjectName(QStringLiteral("errLabel"));
        errLabel->setGeometry(QRect(90, 220, 411, 31));
        QFont font;
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        errLabel->setFont(font);
        okayButton = new QPushButton(EmergencyDialog);
        okayButton->setObjectName(QStringLiteral("okayButton"));
        okayButton->setGeometry(QRect(80, 270, 181, 91));
        dieButton = new QPushButton(EmergencyDialog);
        dieButton->setObjectName(QStringLiteral("dieButton"));
        dieButton->setGeometry(QRect(300, 270, 181, 91));

        retranslateUi(EmergencyDialog);

        QMetaObject::connectSlotsByName(EmergencyDialog);
    } // setupUi

    void retranslateUi(QDialog *EmergencyDialog)
    {
        EmergencyDialog->setWindowTitle(QApplication::translate("EmergencyDialog", "Dialog", 0));
        label->setText(QApplication::translate("EmergencyDialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt;\">Emergency Services</span></p><p align=\"center\"><span style=\" font-size:20pt;\">Have Been Notified!</span></p><p align=\"center\"><br/></p><p align=\"center\"><span style=\" font-size:20pt;\">Please Don't Die!</span></p></body></html>", 0));
        errLabel->setText(QString());
        okayButton->setText(QApplication::translate("EmergencyDialog", "I'm going to be okay!", 0));
        dieButton->setText(QApplication::translate("EmergencyDialog", "I'm going to die!", 0));
    } // retranslateUi

};

namespace Ui {
    class EmergencyDialog: public Ui_EmergencyDialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_EMERGENCYDIALOG_H
