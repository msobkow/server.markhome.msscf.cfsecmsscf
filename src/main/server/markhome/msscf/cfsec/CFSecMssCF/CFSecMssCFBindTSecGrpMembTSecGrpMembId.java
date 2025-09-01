
// Description: Java 11 MssCF Binding for TSecGrpMemb Column TSecGrpMembId.

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
 *	CFSecMssCFBindTSecGrpMembTSecGrpMembId binds TSecGrpMemb.TSecGrpMembId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindTSecGrpMembTSecGrpMembId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindTSecGrpMembTSecGrpMembId() {
		super();
	}

	public CFSecMssCFBindTSecGrpMembTSecGrpMembId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpMemb",
			"TSecGrpMembId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpMembTSecGrpMembId.getValueObject() ";

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

		long tSecGrpMembId;
		if( genDef instanceof ICFSecTSecGrpMembObj ) {
			tSecGrpMembId = ((ICFSecTSecGrpMembObj)genDef).getRequiredTSecGrpMembId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpMembObj" );
		}

		return( tSecGrpMembId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpMembTSecGrpMembId.expandBody() ";

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
			long tSecGrpMembId = ((ICFSecTSecGrpMembObj)genDef).getRequiredTSecGrpMembId();
			ret = Long.toString( tSecGrpMembId );
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
