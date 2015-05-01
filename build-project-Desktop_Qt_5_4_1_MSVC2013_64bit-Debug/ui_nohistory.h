/********************************************************************************
** Form generated from reading UI file 'nohistory.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_NOHISTORY_H
#define UI_NOHISTORY_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_NoHistory
{
public:
    QLabel *label;
    QPushButton *pushButton;

    void setupUi(QDialog *NoHistory)
    {
        if (NoHistory->objectName().isEmpty())
            NoHistory->setObjectName(QStringLiteral("NoHistory"));
        NoHistory->resize(457, 382);
        label = new QLabel(NoHistory);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(20, 20, 411, 231));
        pushButton = new QPushButton(NoHistory);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(110, 270, 221, 81));

        retranslateUi(NoHistory);

        QMetaObject::connectSlotsByName(NoHistory);
    } // setupUi

    void retranslateUi(QDialog *NoHistory)
    {
        NoHistory->setWindowTitle(QApplication::translate("NoHistory", "Dialog", 0));
        label->setText(QApplication::translate("NoHistory", "<html><head/><body><p align=\"center\"><span style=\" font-size:18pt;\">There is no report history to show.</span></p><p align=\"center\"><span style=\" font-size:18pt;\"><br/></span></p><p align=\"center\"><span style=\" font-size:18pt;\">Please create a report in order to</span></p><p align=\"center\"><span style=\" font-size:18pt;\">see a history of all submitted</span></p><p align=\"center\"><span style=\" font-size:18pt;\">reports!</span></p></body></html>", 0));
        pushButton->setText(QApplication::translate("NoHistory", "Done", 0));
    } // retranslateUi

};

namespace Ui {
    class NoHistory: public Ui_NoHistory {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_NOHISTORY_H
