#ifndef NOHISTORY_H
#define NOHISTORY_H

#include <QDialog>

namespace Ui {
class NoHistory;
}

class NoHistory : public QDialog
{
    Q_OBJECT

public:
    explicit NoHistory(QWidget *parent = 0);
    ~NoHistory();

private slots:
    void on_pushButton_clicked();

private:
    Ui::NoHistory *ui;
};

#endif // NOHISTORY_H
