#include "messagebox.h"
#include "ui_messagebox.h"

MessageBox::MessageBox(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::MessageBox)
{
    ui->setupUi(this);
}

QString MessageBox::getMessage(){
    return this->docMess;
}

MessageBox::~MessageBox()
{
    delete ui;
}

void MessageBox::on_pushButton_clicked()
{
    this->docMess = ui->textEdit->toPlainText();
    this->close();
}
