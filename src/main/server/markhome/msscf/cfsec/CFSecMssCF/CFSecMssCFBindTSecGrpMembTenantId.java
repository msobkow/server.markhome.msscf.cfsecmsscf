
// Description: Java 11 MssCF Binding for TSecGrpMemb Column TenantId.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindTSecGrpMembTenantId binds TSecGrpMemb.TenantId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindTSecGrpMembTenantId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindTSecGrpMembTenantId() {
		super();
	}

	public CFSecMssCFBindTSecGrpMembTenantId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpMemb",
			"TenantId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpMembTenantId.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		long tenantId;
		if( genDef instanceof ICFSecTSecGrpMembObj ) {
			tenantId = ((ICFSecTSecGrpMembObj)genDef).getRequiredTenantId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpMembObj" );
		}

		return( tenantId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpMembTenantId.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecTSecGrpMembObj ) {
			long tenantId = ((ICFSecTSecGrpMembObj)genDef).getRequiredTenantId();
			ret = Long.toString( tenantId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpMembObj" );
		}

		return( ret );
	}

}
