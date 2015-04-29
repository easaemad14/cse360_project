#ifndef EMERGENCYDIALOG_H
#define EMERGENCYDIALOG_H

#include <QDialog>

namespace Ui {
class EmergencyDialog;
}

class EmergencyDialog : public QDialog
{
    Q_OBJECT

public:
    explicit EmergencyDialog(QWidget *parent = 0);
    ~EmergencyDialog();

private slots:
    void on_dieButton_clicked();
    void on_okayButton_clicked();

private:
    Ui::EmergencyDialog *ui;
};

#endif // EMERGENCYDIALOG_H
