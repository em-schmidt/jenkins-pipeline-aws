package cloud.atmospheric.AWS

import groovy.grape.Grape
Grape.grab(group:'com.amazonaws', module:'aws-java-sdk', version:'1.11.89')

import com.amazonaws.services.ec2.AmazonEC2Client

String regionslist () {
    ec2 = new AmazonEC2Client()
    regions = ec2.describeRegions().getRegions()

    regionlist = ""
    regions.each {
        regionlist += it.getRegionName() + "\n"
    }
    retrun regionlist
}
