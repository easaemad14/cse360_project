/********************************************************************************
** Form generated from reading UI file 'report.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_REPORT_H
#define UI_REPORT_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QTextEdit>

QT_BEGIN_NAMESPACE

class Ui_Report
{
public:
    QLabel *label;
    QLabel *label_2;
    QLabel *label_3;
    QLabel *label_4;
    QLabel *label_5;
    QLabel *label_6;
    QSpinBox *painBox;
    QSpinBox *drowsBox;
    QSpinBox *nauseaBox;
    QSpinBox *anxBox;
    QSpinBox *depressBox;
    QLabel *label_7;
    QTextEdit *commentField;
    QPushButton *pushButton;
    QPushButton *pushButton_2;

    void setupUi(QDialog *Report)
    {
        if (Report->objectName().isEmpty())
            Report->setObjectName(QStringLiteral("Report"));
        Report->resize(542, 424);
        QFont font;
        font.setPointSize(12);
        Report->setFont(font);
        label = new QLabel(Report);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(100, 10, 291, 71));
        label_2 = new QLabel(Report);
        label_2->setObjectName(QStringLiteral("label_2"));
        label_2->setGeometry(QRect(20, 150, 71, 41));
        label_2->setFont(font);
        label_3 = new QLabel(Report);
        label_3->setObjectName(QStringLiteral("label_3"));
        label_3->setGeometry(QRect(110, 150, 101, 41));
        label_4 = new QLabel(Report);
        label_4->setObjectName(QStringLiteral("label_4"));
        label_4->setGeometry(QRect(230, 150, 71, 41));
        label_5 = new QLabel(Report);
        label_5->setObjectName(QStringLiteral("label_5"));
        label_5->setGeometry(QRect(310, 150, 71, 41));
        label_6 = new QLabel(Report);
        label_6->setObjectName(QStringLiteral("label_6"));
        label_6->setGeometry(QRect(390, 150, 101, 41));
        painBox = new QSpinBox(Report);
        painBox->setObjectName(QStringLiteral("painBox"));
        painBox->setGeometry(QRect(10, 80, 81, 61));
        painBox->setMinimum(1);
        painBox->setMaximum(10);
        painBox->setValue(5);
        drowsBox = new QSpinBox(Report);
        drowsBox->setObjectName(QStringLiteral("drowsBox"));
        drowsBox->setGeometry(QRect(110, 80, 91, 61));
        drowsBox->setMinimum(1);
        drowsBox->setMaximum(10);
        drowsBox->setValue(5);
        nauseaBox = new QSpinBox(Report);
        nauseaBox->setObjectName(QStringLiteral("nauseaBox"));
        nauseaBox->setGeometry(QRect(220, 80, 61, 61));
        nauseaBox->setMinimum(1);
        nauseaBox->setMaximum(10);
        nauseaBox->setValue(5);
        anxBox = new QSpinBox(Report);
        anxBox->setObjectName(QStringLiteral("anxBox"));
        anxBox->setGeometry(QRect(300, 80, 71, 61));
        anxBox->setMinimum(1);
        anxBox->setMaximum(10);
        anxBox->setValue(5);
        depressBox = new QSpinBox(Report);
        depressBox->setObjectName(QStringLiteral("depressBox"));
        depressBox->setGeometry(QRect(390, 80, 81, 61));
        depressBox->setMinimum(1);
        depressBox->setMaximum(10);
        depressBox->setValue(5);
        label_7 = new QLabel(Report);
        label_7->setObjectName(QStringLiteral("label_7"));
        label_7->setGeometry(QRect(10, 200, 211, 41));
        QFont font1;
        font1.setBold(true);
        font1.setWeight(75);
        label_7->setFont(font1);
        commentField = new QTextEdit(Report);
        commentField->setObjectName(QStringLiteral("commentField"));
        commentField->setGeometry(QRect(10, 240, 521, 101));
        commentField->setTabChangesFocus(true);
        pushButton = new QPushButton(Report);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(60, 370, 191, 41));
        pushButton_2 = new QPushButton(Report);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(300, 370, 191, 41));

        retranslateUi(Report);

        QMetaObject::connectSlotsByName(Report);
    } // setupUi

    void retranslateUi(QDialog *Report)
    {
        Report->setWindowTitle(QApplication::translate("Report", "Dialog", 0));
        label->setText(QApplication::translate("Report", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt;\">New Report Page</span></p></body></html>", 0));
        label_2->setText(QApplication::translate("Report", "Pain", 0));
        label_3->setText(QApplication::translate("Report", "Drowsiness", 0));
        label_4->setText(QApplication::translate("Report", "Nausea", 0));
        label_5->setText(QApplication::translate("Report", "Anxiety", 0));
        label_6->setText(QApplication::translate("Report", "Depression", 0));
        label_7->setText(QApplication::translate("Report", "Additional Comments:", 0));
        pushButton->setText(QApplication::translate("Report", "Submit", 0));
        pushButton_2->setText(QApplication::translate("Report", "Quit", 0));
    } // retranslateUi

};

namespace Ui {
    class Report: public Ui_Report {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_REPORT_H
