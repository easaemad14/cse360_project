#ifndef SUBMISSION_H
#define SUBMISSION_H

#include <QDialog>

namespace Ui {
class Submission;
}

class Submission : public QDialog
{
    Q_OBJECT

public:
    explicit Submission(QWidget *parent = 0);
    ~Submission();

private slots:
    void on_pushButton_clicked();

private:
    Ui::Submission *ui;
};

#endif // SUBMISSION_H
