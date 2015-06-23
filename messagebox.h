#ifndef MESSAGEBOX_H
#define MESSAGEBOX_H

#include <QDialog>

namespace Ui {
class MessageBox;
}

class MessageBox : public QDialog
{
    Q_OBJECT

public:
    explicit MessageBox(QWidget *parent = 0);
    QString getMessage();
    ~MessageBox();

private slots:
    void on_pushButton_clicked();

private:
    QString docMess;
    Ui::MessageBox *ui;
};

#endif // MESSAGEBOX_H
