package wood.mike
import grails.rest.*

import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime

@Resource(uri='/api/activity')
class Activity {

    String type
    String description
    LocalDate date
    LocalTime startTime
    Duration duration

    static constraints = {
    }
}