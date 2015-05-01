/********************************************************************************
** Form generated from reading UI file 'history.ui'
**
** Created by: Qt User Interface Compiler version 5.4.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_HISTORY_H
#define UI_HISTORY_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QTabWidget>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_History
{
public:
    QLabel *label;
    QPushButton *pushButton;
    QTabWidget *tabWidget;
    QWidget *tab_3;
    QWidget *tab;
    QWidget *tab_2;
    QWidget *tab_4;
    QWidget *tab_5;

    void setupUi(QDialog *History)
    {
        if (History->objectName().isEmpty())
            History->setObjectName(QStringLiteral("History"));
        History->resize(515, 419);
        label = new QLabel(History);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(100, 0, 271, 71));
        pushButton = new QPushButton(History);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(150, 350, 191, 61));
        tabWidget = new QTabWidget(History);
        tabWidget->setObjectName(QStringLiteral("tabWidget"));
        tabWidget->setGeometry(QRect(40, 80, 431, 261));
        tab_3 = new QWidget();
        tab_3->setObjectName(QStringLiteral("tab_3"));
        tabWidget->addTab(tab_3, QString());
        tab = new QWidget();
        tab->setObjectName(QStringLiteral("tab"));
        tabWidget->addTab(tab, QString());
        tab_2 = new QWidget();
        tab_2->setObjectName(QStringLiteral("tab_2"));
        tabWidget->addTab(tab_2, QString());
        tab_4 = new QWidget();
        tab_4->setObjectName(QStringLiteral("tab_4"));
        tabWidget->addTab(tab_4, QString());
        tab_5 = new QWidget();
        tab_5->setObjectName(QStringLiteral("tab_5"));
        tabWidget->addTab(tab_5, QString());

        retranslateUi(History);

        tabWidget->setCurrentIndex(4);


        QMetaObject::connectSlotsByName(History);
    } // setupUi

    void retranslateUi(QDialog *History)
    {
        History->setWindowTitle(QApplication::translate("History", "Dialog", 0));
        label->setText(QApplication::translate("History", "<html><head/><body><p align=\"center\"><span style=\" font-size:20pt; font-weight:600;\">Report History</span></p></body></html>", 0));
        pushButton->setText(QApplication::translate("History", "Done", 0));
        tabWidget->setTabText(tabWidget->indexOf(tab_3), QApplication::translate("History", "Page", 0));
        tabWidget->setTabText(tabWidget->indexOf(tab), QApplication::translate("History", "Page", 0));
        tabWidget->setTabText(tabWidget->indexOf(tab_2), QApplication::translate("History", "Page", 0));
        tabWidget->setTabText(tabWidget->indexOf(tab_4), QApplication::translate("History", "Page", 0));
        tabWidget->setTabText(tabWidget->indexOf(tab_5), QApplication::translate("History", "Page", 0));
    } // retranslateUi

};

namespace Ui {
    class History: public Ui_History {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_HISTORY_H
