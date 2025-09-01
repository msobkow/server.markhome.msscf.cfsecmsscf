
// Description: Java 11 MssCF Binding for SecUser Column PasswordResetUuid.

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
 *	CFSecMssCFBindSecUserPasswordResetUuid binds SecUser.PasswordResetUuid
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecUserPasswordResetUuid
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecUserPasswordResetUuid() {
		super();
	}

	public CFSecMssCFBindSecUserPasswordResetUuid( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecUser",
			"PasswordResetUuid" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecUserPasswordResetUuid.getValueObject() ";

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

		UUID passwordResetUuid;
		if( genDef instanceof ICFSecSecUserObj ) {
			passwordResetUuid = ((ICFSecSecUserObj)genDef).getOptionalPasswordResetUuid();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}

		return( passwordResetUuid );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecUserPasswordResetUuid.expandBody() ";

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

		if( genDef instanceof ICFSecSecUserObj ) {
			UUID passwordResetUuid = ((ICFSecSecUserObj)genDef).getOptionalPasswordResetUuid();
			if( passwordResetUuid == null ) {
				ret = null;
			}
			else {
				ret = passwordResetUuid.toString();
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}

		return( ret );
	}

}
