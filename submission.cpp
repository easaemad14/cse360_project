#include "submission.h"
#include "ui_submission.h"

Submission::Submission(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::Submission)
{
    ui->setupUi(this);
}

Submission::~Submission()
{
    delete ui;
}

void Submission::on_pushButton_clicked()
{
    this->close();
}
