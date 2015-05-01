/********************************************************************************
** Form generated from reading UI file 'about.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ABOUT_H
#define UI_ABOUT_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>

QT_BEGIN_NAMESPACE

class Ui_about
{
public:
    QLabel *label;

    void setupUi(QDialog *about)
    {
        if (about->objectName().isEmpty())
            about->setObjectName(QStringLiteral("about"));
        about->resize(690, 419);
        about->setStyleSheet(QStringLiteral(""));
        label = new QLabel(about);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(0, 0, 691, 421));
        label->setStyleSheet(QStringLiteral("border-image: url(:/ekg_heart_rate_pulse-other.jpg);"));

        retranslateUi(about);

        QMetaObject::connectSlotsByName(about);
    } // setupUi

    void retranslateUi(QDialog *about)
    {
        about->setWindowTitle(QApplication::translate("about", "Dialog", 0));
        label->setText(QApplication::translate("about", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000;\">Patient Pulse</span><span style=\" font-size:20pt; font-weight:600; color:#ff0000; vertical-align:super;\">TM</span></p><p align=\"center\"><span style=\" color:#ff0000;\"><br/></span></p><p align=\"center\"><span style=\" color:#ff0000;\"><br/></span></p><p align=\"center\"><span style=\" color:#ff0000;\"><br/></span></p><p align=\"center\"><span style=\" color:#ff0000;\"><br/></span></p><p align=\"center\"><span style=\" color:#ff0000;\"><br/></span></p><p align=\"center\"><span style=\" color:#ff0000;\"><br/><br/></span></p><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000; vertical-align:super;\">Version: 0.0.1 (Yes, we are still in Beta)</span></p><p align=\"center\"><span style=\" font-size:20pt; font-weight:600; color:#ff0000; vertical-align:super;\">For any questions or bug reports, please contact the </span></p><p align=\"center\"><span style=\" font-size:20pt; font-w"
                        "eight:600; color:#ff0000; vertical-align:super;\">authors at easaemad14@gmail.com</span></p></body></html>", 0));
    } // retranslateUi

};

namespace Ui {
    class about: public Ui_about {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ABOUT_H
