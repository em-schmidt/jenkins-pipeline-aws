package cloud.atmospheric

@Grab('com.amazonaws:aws-java-sdk:1.11.89')

import com.amazonaws.services.ec2.AmazonEC2Client

class AWS {
    def regionList() {
        ec2 = new AmazonEC2Client()
        regions = ec2.describeRegions().getRegions()

        regionlist = ""
        regions.each {
            regionlist += it.getRegionName() + "\n"
        }
        retrun regionlist
    }
}

