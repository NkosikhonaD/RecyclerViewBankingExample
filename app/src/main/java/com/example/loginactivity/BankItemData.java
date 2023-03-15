package com.example.loginactivity;

public class BankItemData
{
    String serviceName;
    int ImageIcon;

    public BankItemData(String serviceName, int imageIcon) {
        this.serviceName = serviceName;
        ImageIcon = imageIcon;
    }

    public BankItemData()
    {
    }

    public String getName()
    {
        return serviceName;
    }

    public void setName(String name)
    {
        this.serviceName = name;
    }

    public int getImageIcon()
    {
        return ImageIcon;
    }

    public void setImageIcon(int imageIcon) {
        ImageIcon = imageIcon;
    }
}
