
// Description: Java 11 MssCF Binding for TSecGrpInc Column TSecGrpIncId.

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
 *	CFSecMssCFBindTSecGrpIncTSecGrpIncId binds TSecGrpInc.TSecGrpIncId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindTSecGrpIncTSecGrpIncId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindTSecGrpIncTSecGrpIncId() {
		super();
	}

	public CFSecMssCFBindTSecGrpIncTSecGrpIncId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpInc",
			"TSecGrpIncId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpIncTSecGrpIncId.getValueObject() ";

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

		long tSecGrpIncId;
		if( genDef instanceof ICFSecTSecGrpIncObj ) {
			tSecGrpIncId = ((ICFSecTSecGrpIncObj)genDef).getRequiredTSecGrpIncId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpIncObj" );
		}

		return( tSecGrpIncId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindTSecGrpIncTSecGrpIncId.expandBody() ";

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

		if( genDef instanceof ICFSecTSecGrpIncObj ) {
			long tSecGrpIncId = ((ICFSecTSecGrpIncObj)genDef).getRequiredTSecGrpIncId();
			ret = Long.toString( tSecGrpIncId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpIncObj" );
		}

		return( ret );
	}

}
