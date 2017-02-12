@Grab('com.amazonaws:aws-java-sdk:1.11.89')

import com.amazonaws.services.ec2.AmazonEC2Client

class aws implements Serializable {
    private regionList

    def getRegions() {
        ec2 = new AmazonEC2Client()
        regions = ec2.describeRegions().getRegions()

        regionList = ""
        regions.each {
            regionList += it.getRegionName() + "\n"
        }
        regionList
    }
}


