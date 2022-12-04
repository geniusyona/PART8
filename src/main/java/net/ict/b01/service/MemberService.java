package net.ict.b01.service;

import net.ict.b01.dto.MemberJoinDTO;

public interface MemberService {
    static class MidExistException extends Exception {

    }

    void join(MemberJoinDTO memberJoinDTO)throws MidExistException ;

}
