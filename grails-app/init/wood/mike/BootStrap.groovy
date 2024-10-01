package wood.mike

import grails.gorm.transactions.Transactional

import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime
import java.time.Month

class BootStrap {

    def init = { servletContext ->
        addUsers()
        addActivities()
    }

    @Transactional
    void addUsers() {
        def role1 = new Role(authority:"ROLE_USER").save(failOnError: true)
        def user1 = new User(username:"user1",password:"pwd1").save(failOnError: true)
        new UserRole(user: user1, role: role1).save(failOnError: true, flush: true)
    }

    @Transactional
    void addActivities() {
        new Activity( type: 'Ride', description: 'Local lanes', date: LocalDate.of(2024, Month.JULY, 4), startTime: LocalTime.of(8,38), duration: Duration.ofMinutes(184) ).save(failOnError: true)
        new Activity( type: 'Run', description: 'Recovery', date: LocalDate.of(2024, Month.AUGUST, 20), startTime: LocalTime.of(6,20), duration: Duration.ofMinutes(32) ).save(failOnError: true)
        new Activity( type: 'Run', description: '5k', date: LocalDate.now(), startTime: LocalTime.of(6,0), duration: Duration.ofMinutes(20) ).save(failOnError: true)
    }

    def destroy = {
    }
}