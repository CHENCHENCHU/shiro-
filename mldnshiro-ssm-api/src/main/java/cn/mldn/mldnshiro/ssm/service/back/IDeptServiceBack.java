package cn.mldn.mldnshiro.ssm.service.back;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;

import cn.mldn.mldnshiro.ssm.vo.Dept;

public interface IDeptServiceBack {
	@RequiresRoles("dept")
	@RequiresPermissions("dept:add")
	public boolean add(Dept vo);
	
	@RequiresRoles("dept")
	@RequiresPermissions("dept:list")
	public List<Dept> list();
	
	@RequiresRoles("dept")
	@RequiresPermissions("dept:remove")
	public boolean remove(long deptno);
}
