#ifndef LOGINPAGE_H
#define LOGINPAGE_H

#include <QDialog>
#include <QString>
#include <QFile>
#include <QTextStream>

namespace Ui {
class LoginPage;
}

class LoginPage : public QDialog
{
    Q_OBJECT

public:
    explicit LoginPage(QWidget *parent = 0);
    bool getValid();
    QString getLogName();
    QString getLogPass();
    void setLogType(QString type);
    ~LoginPage();

private slots:
    void on_confirmButton_clicked();
    void on_quitButton_clicked();

private:
    bool isValid, isPat;
    QString logName, logPass, logType;
    Ui::LoginPage *ui;
};

#endif // LOGINPAGE_H
