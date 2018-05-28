package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext ctx) throws Exception {
		long millis = System.currentTimeMillis();
		
		Object o = ctx.proceed();
		
		System.out.println("[INFO] " + ctx.getTarget().getClass().getSimpleName() + "->" 
				+ ctx.getMethod().getName() + "\n[INFO] Tempo gasto no acesso ao BD: " 
				+ (System.currentTimeMillis() - millis) + "ms");
		return o;
	}
}
