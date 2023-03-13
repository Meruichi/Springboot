package com.cos.blog.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.blog.model.User;

import lombok.Getter;

// 스프링시큐리티가 로그인요청을 가로채서 로그인을 진행하고 완료되면 UserDetails타입의 오브젝트를
// 스프링시큐리티의 고유한 세션저장소에 저장함
@Getter
public class PrincipalDetail implements UserDetails{
	private User user; // 객체를 직접 들고오는것 : composition(컴푀지션)

	public PrincipalDetail(User user) {
		this.user = user;
	}
	
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() { //계정만료를 확인 true:만료안됨
		return true;
	}

	@Override
	public boolean isAccountNonLocked() { //계정잠김을 확인 true:만료안됨
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() { //비밀번호 만료를 확인 true:만료안됨
		return true;
	}

	@Override
	public boolean isEnabled() { //계정활성화 확인 true:활성화
		return true;
	}
	
	// 계정의 권한(role)을 설정
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> collectors = new ArrayList<>();
		/*
		 * collectors.add(new GrantedAuthority() {
		 * 
		 * @Override public String getAuthority() { return "ROLE_" + user.getRole(); //
		 * 스프링의 규칙 : ROLE_을 붙여야함 } });
		 */
		
		collectors.add(()->{return "ROLE_"+user.getRole();});
		
		return collectors;
	}
	
}
