package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member
{
    private int memberId;
    private String name;
    private Address address;
    private MemberAccount member;
    private List<Member> memberList=new ArrayList<>();

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public MemberAccount getMember() {
        return member;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMember(MemberAccount member) {
        this.member = member;
    }

    public Member(int memberId, String name, Address address, MemberAccount member) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.member = member;
    }

    void openAnAccount(int memberId,String name,Address address)
    {
        /*if(memberList.stream().anyMatch(m -> m.memberId==memberId))
        {
            System.out.println("Account already exits");
        }
        else
        {
            Member member=new Member();
            MemberAccount memberAccount=new MemberAccount(memberId,null);
            member.setMemberId(memberId);
            member.setName(name);
            member.setAddress(address);
            member.setMemberAccount(memberAccount);
            memberList.add(member);
            System.out.println("Account Created");
        }*/
        MemberAccount memberAccount = new MemberAccount();
        this.setMemberAccount(memberAccount);
    }
}
