
// Description: Java 11 MssCF Binding for TSecGrpMemb Column TSecGroupId.

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
 *	CFSecMssCFBindTSecGrpMembTSecGroupId binds TSecGrpMemb.TSecGroupId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindTSecGrpMembTSecGroupId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindTSecGrpMembTSecGroupId() {
		super();
	}

	public CFSecMssCFBindTSecGrpMembTSecGroupId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpMemb",
			"TSecGroupId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpMembTSecGroupId.getValueObject() ";

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

		int tSecGroupId;
		if( genDef instanceof ICFSecTSecGrpMembObj ) {
			tSecGroupId = ((ICFSecTSecGrpMembObj)genDef).getRequiredTSecGroupId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpMembObj" );
		}

		return( tSecGroupId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpMembTSecGroupId.expandBody() ";

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
			int tSecGroupId = ((ICFSecTSecGrpMembObj)genDef).getRequiredTSecGroupId();
			ret = Integer.toString( tSecGroupId );
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
