package hello.core.member;

public class MemberServiceimpl implements MemberService {

    private final MemberRepository memberRepository;
    // new를 하지 않는 이유 : final로 주문할때 생성할건데 위에서 미리 생성하면 안됨

    public MemberServiceimpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
