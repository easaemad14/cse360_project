#ifndef GLOBALS_H
#define GLOBALS_H

#include <QString>

//Enumeration for any option that user can make
enum allOptions {
    //Patient Options
    createNewReport,
    getHistory,
    emergency,

    //Error
    optionQuit,
    optionErr
};

//Data structure representing a report to be written
struct report_t{
    int pain, drowsiness, nausea, anxiety, depression, urgency;
    QString comment, docMessage;
};

#endif // GLOBALS_H

