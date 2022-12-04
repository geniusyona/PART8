package net.ict.b01.service;

import net.ict.b01.dto.PageRequestDTO;
import net.ict.b01.dto.PageResponseDTO;
import net.ict.b01.dto.ReplyDTO;

public interface ReplyService {

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);

}
