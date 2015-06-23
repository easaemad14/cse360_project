#ifndef HISTORY_H
#define HISTORY_H

#include <QDialog>
#include <QFile>

namespace Ui {
class History;
}

class History : public QDialog
{
    Q_OBJECT

public:
    explicit History(QWidget *parent = 0);
    void setTab1Text(QString text);
    void setTab2Text(QString text);
    void setTab3Text(QString text);
    void setTab4Text(QString text);
    void setTab5Text(QString text);
    ~History();

private slots:
    void on_pushButton_clicked();

private:
    Ui::History *ui;
};

#endif // HISTORY_H
