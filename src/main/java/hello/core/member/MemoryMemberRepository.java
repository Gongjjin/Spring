package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    /*
    Memory에 member를 저장하려고 함 이때 필요한 자료구조는 map
    id를 써야하니까 Long과 member의 맵 구조를 만들고 회원을 db에 저장시킬 땐
    save 메소드를 사용하는데 이때 필요한건 아이디와 멤버 정보
    */
    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
