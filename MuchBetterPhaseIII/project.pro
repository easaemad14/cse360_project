#-------------------------------------------------
#
# Project created by QtCreator 2015-04-27T01:18:47
#
#-------------------------------------------------

QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = project
TEMPLATE = app


SOURCES += main.cpp\
        mainwindow.cpp \
    about.cpp \
    loginpage.cpp \
    patientoptionpage.cpp \
    emergencydialog.cpp \
    report.cpp \
    submission.cpp \
    nohistory.cpp \
    history.cpp

HEADERS  += mainwindow.h \
    about.h \
    loginpage.h \
    patientoptionpage.h \
    globals.h \
    emergencydialog.h \
    report.h \
    submission.h \
    nohistory.h \
    history.h

FORMS    += mainwindow.ui \
    about.ui \
    loginpage.ui \
    patientoptionpage.ui \
    emergencydialog.ui \
    report.ui \
    submission.ui \
    nohistory.ui \
    history.ui

RESOURCES += \
    passwords.qrc \
    pulsepic.qrc
