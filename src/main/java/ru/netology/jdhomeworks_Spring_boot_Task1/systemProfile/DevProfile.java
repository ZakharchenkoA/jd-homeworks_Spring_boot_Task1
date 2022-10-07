package ru.netology.jdhomeworks_Spring_boot_Task1.systemProfile;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
