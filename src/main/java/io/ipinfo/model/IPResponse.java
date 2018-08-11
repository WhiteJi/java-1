package io.ipinfo.model;

public class IPResponse {
    private final String ip;
    private final String hostname;
    private final String city;
    private final String region;
    private final String country;
    private final String loc;
    private final String postal;
    private final String org;
    private final String phone;
    private final ASN asn;
    private final Company company;
    private final Carrier carrier;

    public IPResponse(String ip, String hostname, String city, String region, String country, String loc, String postal, String org, String phone, ASN asn, Company company, Carrier carrier) {
        this.ip = ip;
        this.hostname = hostname;
        this.city = city;
        this.region = region;
        this.country = country;
        this.loc = loc;
        this.postal = postal;
        this.org = org;
        this.phone = phone;
        this.asn = asn;
        this.company = company;
        this.carrier = carrier;
    }

    public String getIp() {
        return ip;
    }

    public String getHostname() {
        return hostname;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getLoc() {
        return loc;
    }

    public String getPostal() {
        return postal;
    }

    public String getOrg() {
        return org;
    }

    public String getPhone() {
        return phone;
    }

    public ASN getAsn() {
        return asn;
    }

    public Company getCompany() {
        return company;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    @Override
    public String toString() {
        return "IPResponse{" +
                "ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", loc='" + loc + '\'' +
                ", postal='" + postal + '\'' +
                ", org='" + org + '\'' +
                ", phone='" + phone + '\'' +
                ", asn=" + asn +
                ", company=" + company +
                ", carrier=" + carrier +
                '}';
    }
}
