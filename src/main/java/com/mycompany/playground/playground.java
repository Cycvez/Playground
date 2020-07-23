/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class playground {

    public static void main(String[] args) {
        String data = "Section 5: EC2 - Elastic Compute Cloud0 / 16|1hr 10min"
                + "Section 6: EC2 Instance Storage0 / 12|32minSection 7: ELB & ASG - "
                + "Elastic Load Balancing & AutoScaling Groups0 / 8|34minSection 8: S30 / 19|55minSection 9: "
                + "Databases & Analytics0 / 13|31minSection 10: Other Compute Services: ECS, Lambda,Batch, Lightsail0 / 10|33minSection 11: "
                + "Deployments & Managing Infrastructure atScale0 / 9|29minSection 12: Leveraging the AWS Global Infrastructure0 / 9|37minSection 13: "
                + "Cloud Integrations0 / 7|14minSection 14: Cloud Monitoring0 / 13|36minSection 15: VPC & Networking0 / 9|26min"
                + "Section 16: Security & Compliance / 12|35minSection 17: Machine Learning0 / 9|14minSection 18: Account Management, Billing & "
                + "Support0 / 12|56minSection 19: Advanced Identity0 / 5|7minSection 20: AWS Architecting & Ecosystem0 / 8| 21: Preparing for the Exam + Practice Exam -AWS "
                + "Certified Cloud Practitioner0 / 8|25minSection 22: Congratulations - AWS Certified CloudPractitioner / 3|3minVideo courseTe"
                + "ach the world onlineCreate an online video course, reach students across the globe, and earn moneyUdemyCopyright © 2020 Udemy, Inc."
                + "Terms Privacy Policy and Cookie Policy Help and Support×Close alert";

        System.out.println(addMinutes(data));

    }

    static String addMinutes(String data) {
        data = data.replaceAll("\\s", "");
        char[] c = new char[data.length()];
        int vids = 0;
        int[] minutes = new int[vids];
        int totalMins;

        for (int i = 0; i < data.length(); i++) {
            if (Character.toString(c[i]) == "m" && Character.toString(c[i + 1]) == "i") {

            }
            String vidLength = (Character.toString(c[i - 1]) + Character.toString(c[i - 2]));

            minutes[vids] = Integer.parseInt(vidLength);
            vids++;
        }
    
    }
}
